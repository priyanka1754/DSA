document.getElementById("btn").addEventListener("click",()=>{
    document.getElementById("change-text").textContent="hey there, text modified";
})
let count=document.querySelectorAll("#list li").length+1;
document.getElementById("btn-add").addEventListener("click",()=>{
    const li=document.createElement("li");
    li.textContent=`item ${count++}`;
    document.getElementById("list").appendChild(li);
})