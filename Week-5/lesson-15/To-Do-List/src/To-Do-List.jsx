import React,{useState} from "react"
function ToDoList(){
    const[task,setTask]=useState(["tarun","go-to-office","learn recat"]);
    const[newTask,setNewTask]=useState("");

    function handleInputChange(event){
        setNewTask(event.target.value)

    }
    function addTask(){
        if(newTask.trim()!==""){
        setTask([...task,newTask])
        setNewTask("")
        }

    }
    function deleteTask(index){
        const updatedTask = task.filter((_,i)=>i !==index);
        setTask(updatedTask);

    }
    function moveTaskUp(index){
        if(index>0){
            const updatedTask=[...task];
            [updatedTask[index],updatedTask[index-1]]=
            [updatedTask[index-1],updatedTask[index]]
            setTask(updatedTask);
        }
    }
    function moveTaskDown(index){

        if(index<task.length-1){
            const updatedTask=[...task];
            [updatedTask[index],updatedTask[index+1]]=
            [updatedTask[index+1 ],updatedTask[index]]
            setTask(updatedTask);
        }
    }

    return(
        <div className="To-Do-List">

            <h1>To-Do-list</h1>

        <div>
            <input type="text"
            placeholder="Enter the task" 
            value={newTask}
            onChange={handleInputChange}/>
            <button onClick={addTask} className="add-button">Add Task</button>
        </div>

            <ol>
                {task.map((task,index)=>
                <li key={index}>
                    <span className="text">{task}</span>

                    <button className="delete-button"
                     onClick={()=>deleteTask(index)}
                     >Delete</button>

                      <button className="move-task-up"
                     onClick={()=>moveTaskUp(index)}
                     >☝️</button>

                     <button className="move-task-down"
                     onClick={()=>moveTaskDown(index)}
                     >👇</button>
                </li>)}
                
            </ol>

        </div>
         


    
    );


}
export default ToDoList