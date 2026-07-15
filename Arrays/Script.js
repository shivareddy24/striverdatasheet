// // console.log("Hello Sheshank");
// // let a=5
// // let b=4
// // console.log("a ** b "+(a**b));
// // for(let i=0;i<5;i++){
// //     console.log("ABC")
// // }
// // let str="Sheshank";
// // let size=0;
// // for(let i of str){
// //     console.log("i="+i);
// //     size++;
// // }
// // console.log(size);
// // let student={
// //     name: "ABX",
// //     age:24,
// //     gpa:8.4,
// //     isPass:true

// // };
// // for(let i in student){
// //     console.log("Keys are: "+i);
// // }
// // function abc(){
// //     console.log("Hello Everyone");
// // }
// // abc()
// // function def(a){
// //     console.log("The number selected was "+(a));
// // }
// // def(34);
// // function sum(x,y){
// //     s=x+y;
// //     return s;
// // }
// // let val=sum(35.64,43.543);
// // console.log(val);
// // const arrowSum=(a,b)=>{
// //     console.log(a+b)
// // }
// // arrowSum(69,69);
// // function countVowel(str){

// // }
// // let arr=[2,4,56,7,8,9];
// // for(let a of arr){
// //     console.log(a);
// // }
// // arr.forEach((val,idx,arr)=>{
// //     console.log(val.toUpperCase,idx,arr);
// // })
// // arr.map((val)=>{
// //     console.log(val);
// // })
// // let some=arr.reduce((res,curr)=>{
// //     return res+curr
// // })
// // console.log(some)
// // let n = Number(prompt("Enter a Number"));
// // let arr = [];

// // for (let i = 0; i <= n; i++) {
// //     arr[i] = i;
// // }

// // console.log(arr);
// // console.log("Hello");
// // window.alert("This is just the begining");
// // document.getElementById("heading"); 
// // let headings=document.getElementsByClassName("c1");
// // console.dir(headings);
// // console.log(headings);
// // // let elements=document.querySelector()
// // console.log(document.body.firstChild);
// let div=document.querySelector("div");
// // console.log(div.setAttribute("class","Div"));
// // div.style.backgroundColor="blue";
// // div.innerText="Hello!";
// // div.style.fontSize="26px";
// let newbtn=document.createElement("button");
// newbtn.innerText="Click Me!";
// console.log(newbtn);
// div.append(newbtn);
// // newbtn.onclick=(e)=>{
// //     console.log(e);
// //     console.log(e.type);
// //     console.log(e.target);
// // }
// // newbtn.addEventListener("click",()=>{
// //     console.log("Button was Clicked");
// // });
// let currmode="light";
// newbtn.addEventListener("click",()=>{
//      if(currmode==light){
//         currmode=black;
//         document.querySelector("body").style.backgroundColor="black";
//      }
//      else
//         currmode=light;
//         document.querySelector("body").style.backgroundColor="white";
// })
let promise = new Promise((resolve, reject) => {
    console.log("This is a promise");
});
