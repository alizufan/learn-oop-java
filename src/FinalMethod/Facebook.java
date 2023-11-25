package FinalMethod;


class Facebook extends SocialMedia {
  final void login(String username, String password) {
    // ...
  }
}

class FakeFacebook extends Facebook {
  // ERROR, because the login method is final, you can't override it.
  // void login(String username, String password) {
  //   ...
  // }
}