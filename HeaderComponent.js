import React, { Component } from 'react';
import OnlineMedicine from './OnlineMedicine.jpeg';
class HeaderComponent extends Component {
    render() {
        return (
            <div className="menu-bar">
                <header className="header">
                    <nav className="navbar navbar-expand-lg navbar-light">
                        <a className="navbar-brand" href="#"><img className="ab" src={OnlineMedicine} alt="MedCart"></img></a>
                        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                            DropDown
                        </button>
                        <div className="collapse navbar-collapse" id="navbarNav">
                            <ul className="navbar-nav ml-auto">
                            <li className="nav-item">
                                    <a className="nav-link" href="/signin"><strong>Signin</strong></a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/signup"><strong>Signup</strong></a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/medicines"><strong>Medicines</strong></a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/users"><strong>Users</strong></a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/cart"><strong>Cart</strong></a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/cartitems"><strong>CartItems</strong></a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="/payments"><strong>Payments</strong></a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </header>

            </div>
        );
    }
}

export default HeaderComponent;