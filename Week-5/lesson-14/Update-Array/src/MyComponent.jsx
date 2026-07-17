import React,{useState} from "react"
function MyComponent(){
    const[car ,setCar]= useState([]);
    const[carYear,setYear]=useState(new Date().getFullYear());
    const[carMake,setMake]=useState("");
    const[carModel,setModel]=useState("");

    function handleAddCar(){
        const newCar={year : carYear,
                      make: carMake,
                      model : carModel};
                    setCar(c =>[...c,newCar])


    setYear(new Date().getFullYear()); // or "" if you prefer
    setMake("");
    setModel("");
    }

    function handleRemoveCar(index){
        setCar(c => c.filter((_,i) => i !== index ));
    } 
    function handleYearChange(event){
        setYear(event.target.value)
    }
    function handleMakeChange(event){
        setMake(event.target.value)
    }
    function handleModelChange(event){
        setModel(event.target.value)
    }

    return(
        <div>
            <h2>list the car</h2>

            <ul>{car.map((car,index)=> 
                <li key={index} onClick={()=>handleRemoveCar(index)}>
                    {car.year} {car.make} {car.model}
            </li>)}
        </ul>


            <input type="number" value={carYear} placeholder="enter the car year" onChange={handleYearChange} /> <br />
            <input type="text" value={carMake} placeholder="enter the make" onChange={handleMakeChange} /><br />
            <input type="text" value={carModel} placeholder="enter the model"  onChange={handleModelChange}/><br />
            <button onClick={handleAddCar}>Add car</button>
        </div>
    );
}
export default MyComponent