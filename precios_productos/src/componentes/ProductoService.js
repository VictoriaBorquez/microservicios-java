import axios from "axios";

export class ProductoService{
    baseUrl = "http://localhost:8080/producto/";
    getAll(){
        return axios.get(this.baseUrl + "all").then(res => res.data);
    }
}