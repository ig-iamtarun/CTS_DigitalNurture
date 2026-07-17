import React,{useState,useEffect,useRef} from "react";

function MyComponent(){
let [number,setNumber]=useState(0);

useEffect(()=>{
    console.log('component rendered')
})

function handleClick(){
    setNumber  (n=>n+1);
}

    return(
        <div>
            <button onClick={handleClick}>click</button>
        </div>
    );
}
export default MyComponent