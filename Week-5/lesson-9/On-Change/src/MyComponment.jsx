import React,{use, useState} from "react"
function MyComponment(){
    const[name,setName]=useState("Guest")
    const[quantity, setQuantity]=useState()
    const[comment,setComment]=useState()
    const[payment,setPayment]=useState()
    const[shipping,setShipping]=useState()


    function handleChangeName(event){
        setName(event.target.value);
    }

    function handleChangeQuantity(event){
        setQuantity(event.target.value);
    }

    function handleCommentChange(event){
        setComment(event.target.value);
    }

    function handlePaymentChange(event){
        setPayment(event.target.value);
    }

    function handleShippingChange(event){
        setShipping(event.target.value);
    }

    return(
        <div>
            <input value={name} onChange={handleChangeName} />
            <p> name : {name}</p>

            <input value ={quantity} onChange={handleChangeQuantity} type="number" />
            <p>quantity : {quantity}</p>

            <textarea value={comment} onChange={handleCommentChange}
            placeholder = "enter delivery updates"/>
            <p>comment : {comment}</p>

            <select value={payment} onChange={handlePaymentChange}>
            <option value= "">select a payment method</option>
            <option value="visa">Visa</option>
            <option value="Master">Master</option>
            <option value="Rupay">Rupay</option>
            <option value="Amercian express">Amercian express</option>
            </select>
            <p>payment: {payment}</p>

            <label>
                <input type="radio" value= "pickup"
                        checked={shipping === "pickup"}
                        onChange={handleShippingChange}></input>
                pick up
            </label> <br />
            <label>
                <input type="radio" value="delivery"
                        checked={shipping === "delivery"}
                        onChange={handleShippingChange }></input>
                delivery
            </label>
            <p>Shipping : {shipping }</p>
            
        </div>
    );
}
export default MyComponment