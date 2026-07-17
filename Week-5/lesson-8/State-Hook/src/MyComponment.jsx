import React,{useState} from "react";

function MyComponment(){
    const[name,setName]= useState("Guest");
    const[isEmployed, setIsEmployed]= useState(false);
    
    const updateName =() =>{
        setName("Tarunvijaay")
    }

    const toggleEmployedStatus =() =>{
        setIsEmployed(! isEmployed)
    }
    return(<div>

        <p>name :{name}</p>
        <button onClick={updateName} >setName</button>

         <p>isEmployed :{isEmployed? "yes" : "no"}</p>
        <button onClick={toggleEmployedStatus} >toggleButton</button>


    </div>);
}
export default MyComponment