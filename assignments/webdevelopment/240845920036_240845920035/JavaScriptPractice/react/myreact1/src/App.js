import logo from './logo.svg';
import './App.css';
import {Home} from './Home';
import { About } from './About';
import { Contact } from './Contact';
import { Student } from './Student';
import { Header } from './Header';
function App() {
  return (
    <div>
      <Header></Header>
      <Home/>
      <About></About>
      <Contact></Contact>
      
   <h1>Good Morning</h1>
   </div>
  );
}

export default App;
