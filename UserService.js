import axios from 'axios';

const USERS_API_BASE_URL= "http://localhost:8080/api/v2/users"

class UserService{
    getUsers()
    {
        return axios.get( USERS_API_BASE_URL);
    }

    createUser(user)
    {
       return axios.post( USERS_API_BASE_URL,user)
    }

    getUserById(userId)
    {
        return axios.get( USERS_API_BASE_URL + '/' +userId);
    }
    deleteuser (userId)
    {
        return axios.delete( USERS_API_BASE_URL + '/' +userId)
    }
    updateuser (user)
    {
        return axios.put( USERS_API_BASE_URL + '/' ,user);
    }
    

}
export default new UserService()