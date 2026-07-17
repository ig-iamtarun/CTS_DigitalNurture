import PropTypes from 'prop-types'
function Student(props){
    return(
        <>
        <div className="Student">
        <p>Name:{props.name}</p>
        <p>age: {props.age}</p>
        <p>Student:{props.isStudent ?"yes" : "No"}</p>
        </div>
        </>
    );
}
 Student.propTypes={ 
    name : PropTypes.string,
    age : PropTypes.number,
    isStudent: PropTypes.bool,

};


export default Student;
