import axios from 'axios';

const MEDICINES_API_BASE_URL= "http://localhost:8080/api/v1/medicines"



class MedicineService{
    getMedicines()
    {
        return axios.get( MEDICINES_API_BASE_URL);
    }

    createMedicine(medicine)
    {
       return axios.post( MEDICINES_API_BASE_URL,medicine)
    }

    getMedicineById(medicineId)
    {
        return axios.get( MEDICINES_API_BASE_URL + '/' +medicineId);
    }
    deletemedicine (medicineId)
    {
        return axios.delete( MEDICINES_API_BASE_URL + '/' +medicineId)
    }
    updatemedicine (medicine)
    {
        return axios.put( MEDICINES_API_BASE_URL ,medicine);
    }
    

}
export default new MedicineService()