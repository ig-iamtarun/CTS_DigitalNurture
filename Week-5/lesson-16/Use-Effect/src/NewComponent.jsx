import React,{useState,useEffect} from "react";

function NewComponent(){
    const[width,setWidth]=useState(window.innerWidth)
    const[height,setHeight]=useState(window.innerHeight)

    useEffect(()=>{
            window.addEventListener("resize",handleResize)
    console.log("event listner added")

    return()=>{
        window.removeEventListener("resize",handleResize);
        console.log("event listner removed");
    }
    })
    useEffect(()=>{
        document.title=`size:${width} X ${height}`
    },[width , height])



    function handleResize(){
        setWidth(window.innerWidth);
        setHeight(window.innerHeight);
    }

    return(
        <div>
            <p>window width{width}</p>
            <p>window height{height}</p>

        </div>
    );
}
export default NewComponent