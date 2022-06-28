import React, { Component }  from 'react';

class ListProductosComponent extends Component {
    constructor(props){
        super(props)

        this.state = {
            productos: []
        }
    }
    render() {
        return (
            <div>
                <h2>Lista de productos con precio</h2>
                <div>
                    <table align="center">
                        <thead>
                            <tr>
                                <th>Id Producto</th>
                                <th>Nombre Producto</th>
                                <th>Precio Producto [CLP] </th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.productos.map(
                                    producto => 
                                    <tr key = {producto.id}>
                                        <td>{producto.id}</td>
                                        <td>{producto.name}</td>
                                        <td>{producto.precioPesos}</td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListProductosComponent;