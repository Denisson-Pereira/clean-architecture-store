const API_BASE_URL = 'http://localhost:8080';

document.addEventListener('DOMContentLoaded', () => {
    if (document.getElementById('loginForm')) {

        const loginForm = document.getElementById('loginForm');
        loginForm.addEventListener('submit', handleLogin);
    }

    if (document.getElementById('productsList')) {
        const token = localStorage.getItem('token');
        if (!token) {
            window.location.href = 'index.html';
            return;
        }

        fetchProducts(token);

        const logoutButton = document.getElementById('logout');
        logoutButton.addEventListener('click', handleLogout);
    }
});

async function handleLogin(event) {
    event.preventDefault();

    const login = document.getElementById('login').value;
    const password = document.getElementById('password').value;

    try {
        const response = await fetch(`${API_BASE_URL}/auth/login`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ login, password })
        });

        if (!response.ok) {
            const errorData = await response.json();
            throw new Error(errorData.message || 'Erro ao fazer login');
        }

        const token = await response.text();
        localStorage.setItem('token', token);
        window.location.href = 'products.html';
    } catch (error) {
        const errorDiv = document.getElementById('error');
        errorDiv.textContent = error.message;
    }
}

async function fetchProducts(token) {
    try {
        const response = await fetch(`${API_BASE_URL}/private/products`, {
            method: 'GET',
            headers: {
                'Authorization': `Bearer ${token}`
            }
        });

        if (!response.ok) {
            if (response.status === 401) {
                throw new Error('Token inválido ou expirado. Por favor, faça login novamente.');
            } else {
                throw new Error('Erro ao buscar produtos');
            }
        }

        const products = await response.json();
        displayProducts(products);
    } catch (error) {
        const errorDiv = document.getElementById('error');
        errorDiv.textContent = error.message;
    }
}

function displayProducts(products) {
    const productsList = document.getElementById('productsList');
    if (products.length === 0) {
        productsList.innerHTML = '<p>Nenhum produto encontrado.</p>';
        return;
    }

    const ul = document.createElement('ul');
    products.forEach(product => {
        const li = document.createElement('li');
        li.textContent = product.name;
        ul.appendChild(li);
    });

    productsList.appendChild(ul);
}

function handleLogout() {
    localStorage.removeItem('token');
    window.location.href = 'index.html';
}
