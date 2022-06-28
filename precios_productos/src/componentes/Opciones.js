import React, {Fragment} from 'react';

function Opciones({opcion1, opcion2}){
    console.log(opcion1)
    console.log(opcion2)
    return (
        <Fragment>
            <span align="center"><button name="button1"  onClick={e => opcion1(true)}> { opcion1} </button> </span>
            <span align="center"> <button name="button2" onClick={e => opcion2(true)}> { opcion2 } </button></span>
        </Fragment>
       
    )
}

export default Opciones;