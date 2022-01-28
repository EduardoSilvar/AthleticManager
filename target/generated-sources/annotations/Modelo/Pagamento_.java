package Modelo;

import Modelo.Membro;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-01-26T13:57:54")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Date> data;
    public static volatile SingularAttribute<Pagamento, Membro> IdMembro;
    public static volatile SingularAttribute<Pagamento, Integer> id;
    public static volatile SingularAttribute<Pagamento, String> MesReferente;

}