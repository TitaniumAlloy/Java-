switch (variable) {
    case value1:
        // do something here
        break;
    case value2:
        // do something here
        break;
    
    //... other cases
    
    case valueN:
        // do something here
        break;
    default:
        // do something by default
        break; // it can be omitted
}

/** The switch and case keywords are always required here. The keywords break and default are optional. 
The keyword break stops the execution of the whole switch statement, not just one case. **/

/** If a case does not have the break keyword, the following case will be evaluated as well, including the default case. 
The default case is also evaluated if there's no other case that matches the variable value. 
The break keyword in the default branch is optional and can be omitted. **/
