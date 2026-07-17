
import List from "./List";
function App() {

    const fruits =[{id:1,name:"apple",   calories:49},
                  {id:2,name:"orange" , calories:30},
                  {id:3,name:"bananna", calories:99},
                  {id:4,name:"lemon",   calories:89}];

    const vegatable =[{id:5,name:"beans",   calories:49},
                     {id:6,name:"carrot" , calories:30},
                     {id:7,name:"beetroot", calories:99},
                     {id:8,name:"cauliflor",   calories:89}];              
  return(
    <>
      <List items={fruits} category="fruits"/>
      <List items={vegatable} category="vegatable"/>
    </>
  );
}

export default App
