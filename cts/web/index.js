document.getElementById("btn").addEventListener("click",()=>{
    document.getElementById("change-text").textContent="hey there, text modified";
})
let count=document.querySelectorAll("#list li").length+1;
document.getElementById("btn-add").addEventListener("click",()=>{
    const li=document.createElement("li");
    li.textContent=`item ${count++}`;
    document.getElementById("list").appendChild(li);
})

document.getElementById("my-form").addEventListener("submit",(e)=>{
    e.preventDefault();
    let name=document.getElementById("name").value.trim();
    let email=document.getElementById("email").value;
    let password=document.getElementById("password").value;
    let msg=document.getElementById("msg");
    if(name && email.includes("@") && email.includes(".") && password.length>8){
        msg.textContent=`form submitted with these details name:${name}, email:${email},password: ${password}`;
        msg.style.color="green";
    }else{
        msg.textContent="smtg error";
        msg.style.color="red";
    }
})

document.getElementById("toggle").addEventListener("change",()=>{
    const pwd=document.getElementById("password1");
    pwd.type=this.checked?"text":"password";
})
