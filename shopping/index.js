const blue = document.querySelector('.blue');
const yallow = document.querySelector('.yallow');
const pink = document.querySelector('.pink');
const t = document.querySelector('.t');
const s = document.querySelector('.s');
const p= document.querySelector('.p');

const _t = document.querySelectorAll('._t')
const _p = document.querySelectorAll('._p')
const _s = document.querySelectorAll('._s')
const _blue = document.querySelectorAll('._blue')
const _yallow = document.querySelectorAll('._yallow')
const _pink = document.querySelectorAll('._pink')

let i =0;

t.addEventListener('click', function(){
    t.classList.toggle('active');

    for(i = 0; i < _p.length; i++){
    _p[i].classList.toggle('active')
};
    for(i = 0; i < _s.length; i++){
    _s[i].classList.toggle('active')
};
});

s.addEventListener('click', function(){
    s.classList.toggle('active');

    for(i = 0; i < _t.length; i++){
    _t[i].classList.toggle('active')
};
    for(i = 0; i < _p.length; i++){
    _p[i].classList.toggle('active')
};
});

p.addEventListener('click', function(){
    p.classList.toggle('active');

    for(i = 0; i < _t.length; i++){
    _t[i].classList.toggle('active')
};
    for(i = 0; i < _s.length; i++){
    _s[i].classList.toggle('active')
};
});

blue.addEventListener('click', function(){
    blue.classList.toggle('active');

    for(i = 0; i < _yallow.length; i++){
    _yallow[i].classList.toggle('active')
};
    for(i = 0; i < _pink.length; i++){
    _pink[i].classList.toggle('active')
};
});

yallow.addEventListener('click', function(){
    yallow.classList.toggle('active');

    for(i = 0; i < _blue.length; i++){
    _blue[i].classList.toggle('active')
};
    for(i = 0; i < _pink.length; i++){
    _pink[i].classList.toggle('active')
};
});

pink.addEventListener('click', function(){
    pink.classList.toggle('active');

    for(i = 0; i < _yallow.length; i++){
    _yallow[i].classList.toggle('active')
};
    for(i = 0; i < _blue.length; i++){
    _blue[i].classList.toggle('active')
};
});

