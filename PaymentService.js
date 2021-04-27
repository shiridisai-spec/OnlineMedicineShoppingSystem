import axios from 'axios';

const PAYMENT_API_BASE_URL = "http://localhost:8080/api/v1/payments";

class PaymentService {

    getPayments() {
        return axios.get(PAYMENT_API_BASE_URL);
    }

    createPayment(payment) {
        return axios.post(PAYMENT_API_BASE_URL, payment);
    }

    getPaymentById(id){
        return axios.get(PAYMENT_API_BASE_URL + '/' + id);
    }

    updatePayment(payment, id){
        return axios.put(PAYMENT_API_BASE_URL + '/' + id, payment);
    }   

    deletePayment(id){
        return axios.delete(PAYMENT_API_BASE_URL + '/' + id);
    }
}

export default new PaymentService()