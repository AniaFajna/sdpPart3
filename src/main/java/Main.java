import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		try {
			QueryExecute.executeQuery("INSERT INTO public.\"Animal\" (\"Animal_NAME\") " +
					"VALUES ('ELEPHANT')");
			ResultSet select1 = QueryExecute.executeSelect("SELECT * FROM public.\"Animal\"");
			while(select1.next()) {
				System.out.println(select1.getString("Animal_ID") + " " + select1.getString("Animal_NAME"));
			}

			QueryExecute.executeQuery("DELETE FROM public.\"Animal\" WHERE \"Animal_ID\"=2");
			ResultSet select2 = QueryExecute.executeSelect("SELECT * FROM public.\"Animal\"");
			while(select2.next()) {
				System.out.println(select2.getString("Animal_ID") + " " + select2.getString("Animal_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
