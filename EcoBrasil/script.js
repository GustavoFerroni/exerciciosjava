// Modal de Login/Cadastro
const loginBtn = document.getElementById('login-btn');
const signupBtn = document.getElementById('signup-btn');
const modal = document.getElementById('auth-modal');
const closeBtn = document.querySelector('.close');
const toggleAuth = document.getElementById('toggle-auth');
const modalTitle = document.getElementById('modal-title');
const authForm = document.getElementById('auth-form');

// Abrir modal de login
loginBtn.addEventListener('click', (e) => {
    e.preventDefault();
    modal.style.display = 'flex';
    modalTitle.textContent = 'Login';
    authForm.querySelector('button').textContent = 'Entrar';
    toggleAuth.innerHTML = 'Não tem uma conta? <a href="#">Cadastre-se</a>';
});

// Abrir modal de cadastro
signupBtn.addEventListener('click', (e) => {
    e.preventDefault();
    modal.style.display = 'flex';
    modalTitle.textContent = 'Cadastre-se';
    authForm.querySelector('button').textContent = 'Cadastrar';
    toggleAuth.innerHTML = 'Já tem uma conta? <a href="#">Login</a>';
});

// Alternar entre login e cadastro
toggleAuth.addEventListener('click', (e) => {
    e.preventDefault();
    if (modalTitle.textContent === 'Login') {
        modalTitle.textContent = 'Cadastre-se';
        authForm.querySelector('button').textContent = 'Cadastrar';
        toggleAuth.innerHTML = 'Já tem uma conta? <a href="#">Login</a>';
    } else {
        modalTitle.textContent = 'Login';
        authForm.querySelector('button').textContent = 'Entrar';
        toggleAuth.innerHTML = 'Não tem uma conta? <a href="#">Cadastre-se</a>';
    }
});

// Fechar modal
closeBtn.addEventListener('click', () => {
    modal.style.display = 'none';
});

window.addEventListener('click', (e) => {
    if (e.target === modal) {
        modal.style.display = 'none';
    }
});

// Menu mobile
const mobileMenu = document.querySelector('.mobile-menu');
const nav = document.querySelector('nav ul');

mobileMenu.addEventListener('click', () => {
    nav.style.display = nav.style.display === 'flex' ? 'none' : 'flex';
});

// Formulário de contato
const contactForm = document.getElementById('contact-form');

contactForm.addEventListener('submit', (e) => {
    e.preventDefault();
    alert('Mensagem enviada com sucesso! Entraremos em contato em breve.');
    contactForm.reset();
});

// Efeito de scroll suave
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();
        const targetId = this.getAttribute('href');
        if (targetId === '#') return;
        const targetElement = document.querySelector(targetId);
        targetElement.scrollIntoView({
            behavior: 'smooth'
        });
    });
});