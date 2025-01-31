package demoblazeNawy;
import com.github.javafaker.Faker;

public class FakerUtil {
	public static Faker faker = new Faker();
	
	public static String genrateUsername() {
		return faker.name().username();
	}
	public static String genratePassword() {
		return faker.internet().password();
	}

}
