const input=document.getElementById('input');
const btn=document.querySelectorAll('button');
let str='';
btn.forEach((buttons)=>{
    buttons.addEventListener('click',(e)=>{
        const value=e.target.innerText;
        if(value==='='){
            str=eval(str);
            input.value=str;
        }
        else if(value==='AC'){
            str="";
            input.value=str;
        }
        else if(value=='DEL'){
            str=str.substring(0,str.length-1);
            input.value=str;
        }
        else{
            str+=value;
            input.value=str;
        }
    })
})