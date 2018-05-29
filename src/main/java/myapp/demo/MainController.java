package myapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@Autowired
	private ContactRepository contactRepository;

	//@ResponseBody
	@RequestMapping("/")

	public String home() {
		String html = "";
		html += "<ul>";
		html += " <li><a href='/testInsert'>Test Insert</a></li>";
		html += " <li><a href='/showAllContact'>Show All Contacts</a></li>";
		html += "</ul>";
		return html;
	}

	@ResponseBody
	@RequestMapping("/testInsert")
	public String testInsert() {
		Long maxId = this.contactRepository.getMaxId();

		Contact contact = new Contact();

		long Id = maxId + 1;
		String publicId = "A" + Id;

		String firstName = "fName_" + publicId;

		String lastName = "lName_" + publicId;

		contact.setPublicId(publicId);
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		this.contactRepository.save(contact);

		return "Inserted: " + contact;
	}

	@ResponseBody
	@RequestMapping("/showAllContact")
	public String showAllContact() {

		Iterable<Contact> contacts = this.contactRepository.findAll();

		String html = "";
		for (Contact person : contacts) {
			html += person.getFirstName() + person.getLastName() + "<br>";
		}

		return html;
	}
}