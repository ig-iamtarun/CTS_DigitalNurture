import Tarun from './assets/brocode.jpeg'
function Card(){
    return(
        <div className="card">
            <img className="card-image"src={Tarun} alt="profile pic" />
            <h2 className="card-title">Tarun Vijaay</h2>
            <p className="card-text">Pro Coder</p>
        </div>
    );
}
export default Card