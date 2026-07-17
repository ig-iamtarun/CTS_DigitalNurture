function List(props){
    const listItem=props.items;


    // fruits.sort((a,b) => b.name. localeCompare(a.name));


    const itemList= listItem.map(items => <li key={items.id}>
                                        {items.name}: &nbsp;
                                       <b>{items.calories}</b> </li>)

    return(<>
            <h3>{props.category}</h3>
            <ol>{itemList}</ol>
                </>);
}
export default List
