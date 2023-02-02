import {
  addNewUser,
  getUsers,
  getUserWithId,
  updateUser,
  deleteUser,
} from "../controllers/login/userController";



const controller = require("../controllers/login/authController");

import { authentication, verifySignUp } from "../middleware";


const routes = (app) => {
  app
    .route("/users")

    .get(getUsers)

    .post(addNewUser);
  app
    .route("/user/:UserId")

    .get(getUserWithId)

    .put(updateUser)

    .delete(deleteUser);

  app.post(
    "/auth/signup",
    [verifySignUp.checkDuplicateUsername, verifySignUp.checkRolesExisted],
    controller.signup
  );

  app.post("/auth/signin", controller.signin);
};
export default routes;
