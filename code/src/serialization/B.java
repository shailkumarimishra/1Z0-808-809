package serialization;

import java.io.Serializable;
//public class B{---->RunTimeException-->NonSerializableExeception
public class B implements Serializable{
C c=new C();
}
