import React,{useState,useEffect} from "react"
function MyComponent(){
    const[count,setCount]=useState(0);
    const[color,setColor]=useState("green");

    function addCount(){
        setCount(c=>c+1)
    }
    function subCount(){
        setCount(c=>c-1)
    }
    function changeColor(){
        setColor(c=> c=== "green"? "red":"green");
    }

    useEffect(()=>{
        document.title=`count: ${count}${color }`
    },[count][color ])

return(
    <div>
        <p style={{color:color}}>count:{count}</p>
        <button onClick={addCount}>Add</button>
        <button onClick={subCount}>Subtract</button> <br />
        <button onClick={changeColor}>Change Color</button>
    </div>
);
}


export default MyComponent