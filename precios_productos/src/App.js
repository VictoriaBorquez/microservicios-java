import React, { Fragment } from 'react';
import  { useState } from 'react';
import './App.css';
import Header from './componentes/Header';
import ListProductosComponent from './componentes/ListProductosComponent';
import Opciones from './componentes/Opciones';

function App() {
  const [opcion1, setOpcion1] = useState(false);
  const [opcion2, setOpcion2] = useState(false);
  
  let componente;
  if(setOpcion1 == false){
    componente = <ListProductosComponent />
  }else{
    console.log("La opcion2 se activo")
  }
  
  return (
    <Fragment>
      <Header 
        titulo="Lista de productos"
      />
      <span  align="center"><button type="button" name="button1" 
        onClick={() =>  setOpcion1(true)}
      >
      Mostrar lista original
      </button></span>
      {
        opcion1 && ¡Se muestra el texto!
      }
      <br></br>
      <span  align="center"> <button name="button2" 
        onClick={() => {
          setOpcion2(true);
      }}
      >
      Mostrar lista con precios adicionales
      </button></span>

    </Fragment>
      
  );
}

export default App;
