package serialization;

import java.io.Serializable;

public class CMT implements Serializable {
private String dataSerialized;

public CMT(String dataSerialized) {
	super();
	this.dataSerialized = dataSerialized;
}

public String getDataSerialized() {
	return dataSerialized;
}


}
