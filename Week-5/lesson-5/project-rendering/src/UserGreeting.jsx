import propTypes from 'prop-types';
function UserGreeting(props){

    const welcomeMessage = <h2 className="welcome-message"> welcome {props.userName}</h2>

    const loginPrompt = <h2 className="login-prompt">please login to  continue</h2>
    
    return(props.isloggedIn ? welcomeMessage: loginPrompt);
}
UserGreeting.prototype={
    isloggedIn:propTypes.bool,
    userName: propTypes.string,
}
UserGreeting.defaultProps={
    isloggedIn: false,
    userName:"Guest", 
}
   
export default UserGreeting 