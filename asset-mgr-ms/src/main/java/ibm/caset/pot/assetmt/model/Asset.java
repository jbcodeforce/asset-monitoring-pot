package ibm.caset.pot.assetmt.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
@Table("assets")
public class Asset {
  @PrimaryKey
  public long id;
  public String os;
  public String type;
  public int unsuccessfulLogin = 0;
  public String ipAddress;
  public String antivirus;
}
