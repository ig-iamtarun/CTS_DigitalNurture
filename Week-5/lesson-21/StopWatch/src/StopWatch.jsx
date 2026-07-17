import React,{useState,useRef} from "react";
function StopWatch(){
const [time ,setTime]=useState(null);
const [now,setNow]=useState(null);

const intervalRef = useRef(null);

    function handleStart(){
        setTime(Date.now());
        setNow(Date.now());
        intervalRef.current= setInterval(()=>{
            setTime(Date.now());
        },10)
    }
    function handleStop(){
        clearInterval(intervalRef.current)

    
    }
    function handleReset(){ 
             clearInterval(intervalRef.current);
                intervalRef.current = null;
                setTime(0);
                setNow(0);
    }
let timePassed =(time-now)/1000 ;
    return(
        <div>
            <h1>StopWatch</h1>
            <h2>StopWatch:{timePassed.toFixed(3)}</h2>
            <div>
                <button onClick={handleStart}>Start</button>
                <button onClick={handleStop}>Stop</button>
                <button onClick={handleReset}>Reset</button>
            </div>
        </div>
    );
}
export default StopWatch