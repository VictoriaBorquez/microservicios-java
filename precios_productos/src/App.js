import React, { Fragment } from 'react';
import { Component } from 'react';
import { useState } from 'react';
import './App.css';
import { ProductoService } from './componentes/ProductoService';
import {DataTable} from 'primereact/datatable';
import { Column } from 'primereact/column';
import {Panel} from 'primereact/panel';
import 'primereact/resources/themes/nova/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';
import { PreciosService } from './componentes/PreciosService';

export default class App extends Component{
    constructor(){
        super();
        this.state = {
            panelcontainer:false,
            panelcontainer2:false,
        };
        this.productoService = new ProductoService();
        this.preciosService = new PreciosService();
        
    }

    componentDidMount(){
        this.productoService.getAll().then(data => this.setState({productos: data}))
       this.preciosService.getAll().then(data => this.setState({precios: data}))
    }

    render(){
        var HandleChange = e =>{
            this.setState({panelcontainer:!this.state.panelcontainer});
        }
        const x=this.state.panelcontainer;
        var HandleChange2 = e =>{
            this.setState({panelcontainer2:!this.state.panelcontainer2});
        }
        const x2=this.state.panelcontainer2;
        return(
            <Fragment>
                <h1>Productos</h1>
                <button onClick={HandleChange}>{x?'Ocultar Lista Productos':'Mostrar Lista Productos'}</button>
                {
                    x && (<Panel header=" Lista Productos" style={{width:'80%',  margin: '0 auto', marginTop: '20px'}}>
                    <DataTable value={this.state.productos}>
                        <Column field="id" header="ID"></Column>
                        <Column field="nombre" header="Nombre"></Column>
                        <Column field="precio_peso" header="Precio peso"></Column>
                    </DataTable>
                </Panel>)
                }
                
                <button onClick={HandleChange2}>{x2?'Ocultar Lista Productos con precios adicionales':'Mostrar Lista Productos con precios adicionales'}</button>
                {
                    x2 && (<Panel header=" Lista Productos actualizados" style={{width:'80%',  margin: '0 auto', marginTop: '20px'}}>
                    <DataTable value={this.state.precios}>
                        <Column field="id" header="ID"></Column>
                        <Column field="nombre" header="Nombre"></Column>
                        <Column field="precio_peso" header="Precio peso"></Column>
                        <Column field="precio_dolar" header="Precio dolar"></Column>
                        <Column field="precio_euro" header="Precio euro"></Column>
                    </DataTable>
                    </Panel>)
                }
            
            </Fragment>
            
        );
    }
}

