const text1 = document.querySelector(".text1")
const text2 = document.querySelector(".text2")
const resurt = document.querySelector(".resurt")
const resu = document.querySelector(".resu")

const resurt_ =function(){
const a = parseFloat(text1.value);
const b = parseInt(text2.value);
resurt.value = a + b;
}


resu.addEventListener('click' , resurt_);