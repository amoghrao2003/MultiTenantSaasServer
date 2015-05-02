package sjsu.team21.service;

import sjsu.team21.MongoDBImpl.ProjectDetailsDAO;
import sjsu.team21.models.User;
import sjsu.team21.mongoModels.MProjectDetails;
import sjsu.team21.mongoModels.MUser;

public class ProjectDetailsService {

	ProjectDetailsDAO projectDetailsDAO =new ProjectDetailsDAO();
	public void insertProjectDetails(String projectDetails,String user_id,String project_id) {
		// TODO Auto-generated method stub
		projectDetailsDAO.insertProjectDetails(projectDetails,user_id,project_id);
	}
	public void editProjectDetails(String projectDetails, String user_id, String project_id) {
		// TODO Auto-generated method stub
		projectDetailsDAO.editProjectDetails(projectDetails,user_id,project_id);
	}
	/*public void insertTaskDetails(String taskDetails) {
		// TODO Auto-generated method stub
		projectDetailsDAO.insertTaskDetails(taskDetails);
	}*/
	public String getTaskDetails(String project_id,String user_id) {
		// TODO Auto-generated method stub
		return projectDetailsDAO.getTaskDetails(project_id,user_id);
	}
	public String getProjectDetails(String user_id) {
		// TODO Auto-generated method stub
		return projectDetailsDAO.getProjectDetails(user_id);
	}
	public void createDocument(User userModel) {
		// TODO Auto-generated method stub
		MUser mUser = new MUser();
		mUser.setUser_id(String.valueOf(userModel.getId()));
		//MProjectDetails mProjectDetails = new MProjectDetails();
		MProjectDetails[] mProjectDetailsArray = {};
		mUser.setProjectDetails(mProjectDetailsArray);
		new ProjectDetailsDAO().createDocument(mUser);
		
	}
	
	

}
