import axios from "axios";

export class PreciosService{
    baseUrl = "http://localhost:8080/calcularNuevosPrecios/";
    getAll(){
        return axios.get(this.baseUrl + "listar").then(res => res.data);
    }
}