package org.iptime.jmsnet;

import org.iptime.jmsnet.dao.SampleDao;
import org.iptime.jmsnet.dao.TeacherDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private SampleDao sampleDAO;

	@Autowired
	private TeacherDao teacherDao;


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		try {
			List<Map<String, Object>> userList = sampleDAO.selectUserList();
			teacherDao.insertTeacher("JungMS", "2015.05.05", "01041808246", null);

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}


		return "home";
	}

}
