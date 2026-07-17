import React,{useState} from "react"
function MyComponent(){

    const[food,setFood]=useState(["apple","orange","bananna"])

    function handleAddFood(){
        const newFood=document.getElementById("foodInput").value
        document.getElementById("foodInput").value=""
        setFood([... food,newFood]);
    }

    function handleDeleteFood(index){
        setFood(food.filter((_,i)=>i !== index));

    }
    return(
        <div>
            <h2>List of food</h2>
            <ul>{food.map((food,index) =>(
                <li key={index} onClick={()=>handleDeleteFood(index)}>
                    {food}
                    </li>))}
            </ul>
            <input type="text" id="foodInput" placeholder="enter the food" />
            <button onClick={handleAddFood}>Add food</button>
        </div>
    );

}
export default MyComponent