import axios from 'axios';

const fetchData = async () => {
  try {
    const response = await axios.get('http://localhost:8080/api/endpoint'); // Your backend URL
    console.log(response.data);
  } catch (error) {
    console.error('There was an error fetching data from the backend!', error);
  }
};
