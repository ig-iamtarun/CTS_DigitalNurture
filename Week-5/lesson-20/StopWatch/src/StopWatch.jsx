import React,{useState,useEffect,useRef} from "react"
function StopWatch(){
const[isRunning, setIsRunnig]=useState(false);
const[elapsedTime,setElspsedTime]=useState(0);
const intervalIdRef= useRef(null);
const startTimeRef =useRef(0);

useEffect(()=>{

},[isRunning]);

function start(){
    setIsRunnig(true);
    startTimeRef.current= Date.now()- elapsedTime;
    console.log(startTimeRef);
}
function stop(){

}
function reset(){

}
function formatTime(){
    return`00:00:00`;

}
return(
    <div className="stopwatch">
        <div className="display">{formatTime()}</div>
        <div className="controls">
            <button onClick={start} className="start-button">start</button>
            <button onClick={stop} className="stop-button">stop</button>
            <button onClick={reset}className="reset-button">reset</button>

        </div>
    </div>
);

}
export default StopWatch