import React, { Component } from 'react';
import PaymentService from '../services/PaymentService';


class CreatePaymentComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            paymentId: this.props.match.params.paymentId,
            cardType: '',
            cardNo: '',
            paymentamount: ''
        }
       
        this.changeCardTypeHandler = this.changeCardTypeHandler.bind(this)
        this.changeCardNoHandler = this.changeCardNoHandler.bind(this)
        this.changePaymentAmountHandler = this.changePaymentAmountHandler.bind(this)
        this.saveorUpdatePayment = this.saveorUpdatePayment.bind(this);
    }

    componentDidMount(){

        if(this.state.paymentId === '_add'){
            return
        }else{
            PaymentService.getPaymentById(this.state.paymentId).then( (res) =>{
                let payment = res.data;
                this.setState({cardType: payment.cardType,
                    cardNo: payment.cardNo,
                    paymentamount : payment.paymentamount
                });
            });
        }        
    }

    saveorUpdatePayment = (e) => {
        e.preventDefault();
        let payment = {cardType: this.state.cardType, cardNo: this.state.cardNo, paymentamount: this.state.paymentamount};
        console.log('payment => ' + JSON.stringify(payment));

        if(this.state.paymentId === '_add'){
        PaymentService.createPayment(payment).then(res => {
            this.props.history.push('/payments');
        });
    } else{
        PaymentService.updatePayment(payment, this.state.paymentId).then( res => {
            this.props.history.push('/payments');
            });
        }
    }
   
     changeCardTypeHandler = (event) => {
        this.setState({cardType: event.target.value}); 
     }
     changeCardNoHandler = (event) => {
        this.setState({cardNo: event.target.value}); 
    }
    changePaymentAmountHandler = (event) => {
        this.setState({paymentamount: event.target.value}); 
    }

    cancel(){
        this.props.history.push('/payments');
    }


    getTitle(){
        if(this.state.paymentId === '_add'){
            return <h3 className="text-center">Add Payment</h3>
        }else{
            return <h3 className="text-center">Update Payment</h3>
        }
    }

     
     render() {
        return (
            <div>
                <br></br>
                <div className = "container">
                    <div className = "row">
                        <div className = "card col-md-6 offset-md-3 offset md-3">
                                {
                                    this.getTitle()
                                } 
                            <div className = "card-body">
                                <form>
                                      <div className = "form-group">
                                          <label> Card Type: </label>
                                          <input placeholder="Card Type" name="cardType" className ="form-control"
                                        value={this.state.cardType} onChange={this.changeCardTypeHandler}/>
                                        </div>
                                        <div className = "form-group">
                                        <label> Card Number: </label>
                                          <input placeholder="Card Number" name="cardNo" className ="form-control"
                                        value={this.state.cardNo} onChange={this.changeCardNoHandler}/>
                                        </div>
                                        <div className = "form-group">
                                        <label> Payment Amount: </label>
                                          <input placeholder="Amount" name="paymentamount" className ="form-control"
                                        value={this.state.paymentamount} onChange={this.changePaymentAmountHandler}/>
                                      </div>

                                      <button className="btn btn-success" onClick={this.saveorUpdatePayment}>Save</button>
                                      <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                </form>
                            </div>
                        </div> 
                    </div>
                </div>
            </div>
        );
    }
}


export default CreatePaymentComponent;