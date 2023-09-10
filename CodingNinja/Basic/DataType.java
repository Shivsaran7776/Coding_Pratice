// Each data type has a different size.You've studied 5 different data types and the sizes of the data types:

// Integer : 4 bytes
// Long : 8 bytes
// Float : 4 bytes
// Double : 8 bytes
// Character : 1 byte

import java.util.*;
public class DataType{
    public static int dataTypes(String type) {
        // Write your code here
        
        if(type.equals("Integer") || type.equals("Float"))
        {
            return 4;
        }
        else if(type.equals("Long") || type.equals("Double"))
        {
            return 8;
        }
        else if(type.equals("Character"))
        {
            return 1;
        }
        return -1;
    }
}