
<style>
  /* body {
        min-width: 560px !important;
    } */

  .color-1 {
    background-color: #2b4a27;
  }

  .textColor-1 {
    color: #2b4a27;
  }

  .borderColor-1 {
    border-color: #2b4a27 !important;
  }

  .color-2 {
    background-color: #e5623a;
  }

  .textColor-2 {
    color: #e5623a;
  }

  .color-white {
    background-color: white;
  }

  .textColor-white {
    color: white;
  }

  .color-black {
    background-color: black;
  }

  .textColor-black {
    color: black;
  }

  .color-light {
    background-color: rgb(215, 215, 215);
  }

  .textColor-light {
    color: rgb(215, 215, 215);
  }

  .scrollBar-10::-webkit-scrollbar-track {
    background-color: transparent !important;
  }

  #header {
    display: flex;
  }

  #mobile-header {
    display: none;
  }

  #hidden-menu {
    display: none;
  }

  #side-ads {
    display: flex;
    flex-direction: column;
  }

  @media screen and (max-width: 600px) {
    #side-ads {
      display: none;
    }

    #header {
      display: none;
    }

    #mobile-header {
      display: flex;
    }

    #hidden-menu {
      display: unset;
      transition: all, 0.5s;
    }

    .hide {
      transform: translateX(-100%);
    }
  }

  .border-none {
    border: 0px !important;
  }

  .br-14 {
    border-radius: 14px !important;
  }

  .card-title h5 {
    color: #2b4a27 !important;
  }

  .page-link {
    border: none !important;
  }

  .page-item.active .page-link {
    border-radius: 18px;
    padding: 6px 13px !important;
    background-color: #e5623a !important;
  }

  @media (max-width: 767px) {
    .carousel-inner .carousel-item > div {
      display: none;
    }

    .carousel-inner .carousel-item > div:first-child {
      display: block;
    }
  }

  .carousel-inner .carousel-item.active,
  .carousel-inner .carousel-item-next,
  .carousel-inner .carousel-item-prev {
    display: flex;
  }

  /* medium and up screens */
  @media (min-width: 768px) {
    .carousel-inner .carousel-item-end.active,
    .carousel-inner .carousel-item-next {
      transform: translateX(25%);
    }

    .carousel-inner .carousel-item-start.active,
    .carousel-inner .carousel-item-prev {
      transform: translateX(-25%);
    }
  }

  .carousel-inner .carousel-item-end,
  .carousel-inner .carousel-item-start {
    transform: translateX(0);
  }

  .border-none-top {
    /* border: 1px solid #e2e2e2 !important;
        border-top: none !important; */
    border-radius: 0 0 12px 12px;
    background-color: #fff !important;
  }

  .black-circle {
    background: #fff;
    border-radius: 30px;
    padding: 3px 8px;
  }
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js">
</script>

<script>
  let items = document.querySelectorAll(".carousel .carousel-item");

  items.forEach((el) => {
    const minPerSlide = 4;
    let next = el.nextElementSibling;
    for (var i = 1; i < minPerSlide; i++) {
      if (!next) {
        // wrap carousel by using first child
        next = items[0];
      }
      let cloneChild = next.cloneNode(true);
      el.appendChild(cloneChild.children[0]);
      next = next.nextElementSibling;
    }
  });
</script>

<script>
  const posts = document.getElementById("posts");
  const lang = "{{ lang }}";

  let allLoadedPosts = [];

  let isLoadingPosts = false;
  let isNoMorePosts = false;

  let str_total_page = "{{ totalPostsCount }}";
  let int_total_page = parseInt(str_total_page);

  {% comment %} console.log("total page "+int_total_page+"");
  let total_page = int_total_page - 1; {% endcomment %}
  let total_page;
  let active_page = 1;
  let starting_button = 1;

  function loadPosts(pageNumber) {
    let varPosts = document.getElementsByClassName("post");
    //console.log (varPosts.length);

    while(varPosts.length > 0){
      varPosts[0].remove();
    }

    console.log("{{ totalPostsCount }}");
    isLoadingPosts = true;

    $("#loader").show();
    //$("#pageNavBar").addClass('d-none');
    $("#pageNavBar").hide();
    // console.log("NikuBad", "{{ csrf_token }}");

    data = {
      type: "load",
      page_number: pageNumber,
      csrfmiddlewaretoken: "{{ csrf_token }}",
    };

    $.ajax({
      type: "POST",
      url: "{% url 'home' %}",
      data: data,
      success: (response) => {
        //console.log("Total posts: "+response.totalPostsCount+"");
        total_page = Math.floor(response.totalPostsCount/10);
        if (response.totalPostsCount%10 > 0){total_page += 1} 
        //alert(total_page);
        document.getElementById("lastPageString").innerHTML = "Last Page "+total_page;
        rearrangeBtns(true);
        if (response.result == "success") {
          if (response.posts.length > 0) {
            allLoadedPosts = [];
            response.posts.forEach((post) => {
              allLoadedPosts.push(post);
              createPostElement(post);
            });
          } else {
            isNoMorePosts = true;
            if (pageNumber == 0 && allLoadedPosts.length == 0) {
              $("#noPosts").show();
            }
          }
        } else {
          if ("invalid" in response) {
            window.location.href = "{% url 'invalid' %}";
          }
        }
        $("#loader").hide();
        $("#pageNavBar").show();
        isLoadingPosts = false;
      },
      error: (xhr, errmsg, err) => {
        console.log("Loading Posts ... ", xhr.status);
        $("#loader").hide();
        $("#pageNavBar").show();
        console.log(xhr.status + ": " + xhr.responseText); // provide a bit more info about the error to the console
      },
    });
  }

  function createPostElement(postMap) {
    let post = document.createElement("div");
    post.setAttribute("id", "post_" + postMap["id"]);
    post.classList.add("post");
    post.setAttribute("style", "width:100%");
    post.innerHTML = `
      <div class="col-lg-12" dir="rtl">
        <div class="card mb-3 border-none" style="border: none;">
            <div class="row g-0">
              <a style="display: contents;" href="/posts/`+postMap["id"]+`"><div class="col-md-4 d-flex">
                    <div style="background-image:url('`+postMap["link"]+`'); background-size:cover; background-position:center;"
                        class="img-fluid rounded-start flex-grow-1"> </div>
                </div></a>
                <div class="col-md-8">
                  <a href="/posts/`+postMap["id"]+`"><div class="card-body">
                        <h5 class="textColor-1  card-title">`+postMap["name"]+`</h5>
                        <p class="card-text"><small class="text-muted">`+postMap["dateTime"]+`</small></p>
                        <div dir="rtl" class="card-text textClamp-3">`+postMap['outerText']+`</div> 
                    </div>
                  </a>
                      <div class="d-flex px-3">
                        <div class="post_action_item d-flex ms-2 like_`+postMap["id"]+`" name="like_`+ postMap["id"]+`" >
                          <i class="`+(postMap["isLiked"] ? "bi-heart-fill" : "bi-heart")+`" style="`+(postMap["isLiked"] ? "color: #D7443E" : "")+`">
                          </i>
                          <p name="likeCount_`+postMap["id"]+`">
                            `+postMap["likesCount"]+`
                          <p>
                        </div>
                        <div class="d-flex ms-2" id="postComment_`+postMap["id"]+`">
                          <i class="bi bi-chat-left mx-1">
                          </i>
                          <p name="commentCount_`+postMap["id"]+`">
                            `+postMap["comments"]+`
                          <p>
                        </div>
                        <a class="flex-grow-1" href="/posts/`+postMap["id"]+`"> <div> </div> </a>
                      </div>
                </div>
            </div>
        </div>
    </div>
      `;

    posts.appendChild(post);

    $("[name='like_" + postMap["id"] + "']").click((e) => {
      //console.log(" like clicked");
      console.log(e);
      if ("{{ isLoggedIn }}" == "True") {
        postID = $(e.target)
          .closest(".post_action_item")
          .attr("name")
          .replace("like_", "");

        //console.log(postMap["isLiked"]);

        likePost(
          postID,
          //(postMap["isLiked"]) ? "false" : "true",
          $("[name='like_" + postID + "'] > i").hasClass("bi-heart")
        );
      } else {
        loginUser();
      }
    });

    $("#postComment_" + postMap["id"]).click((e) => {
      if ("{{ isLoggedIn }}" == "True") {
        let param = encodeURI(postMap["id"]);
        window.location.href = "{% url 'post' 123456 %}".replace(/123456/, param);
      } else {
        loginUser();
      }
    });
  }

  loadPosts(0);

  function likePost(postID, isLike) {
    $.ajax({
      type: "POST",
      url: "{% url 'home' %}",
      data: {
        type: "like",
        postID: postID,
        isLike: isLike,
        csrfmiddlewaretoken: "{{ csrf_token }}",
      },
      success: (response) => {
        if (response.result == "success") {
          //console.log("Liked");
          $("[name='like_" + postID + "'] > i")
            .toggleClass("bi-heart-fill")
            .toggleClass("bi-heart");
          $("[name='like_" + postID + "'] > i").css(
            "color",
            isLike ? "#D7443E" : "black"
          );
          $("[name='likeCount_" + postID + "']").html(response.likes);
        }
      },
      error: (xhr, errmsg, err) => {
        console.log(xhr.status + ": " + xhr.responseText); // provide a bit more info about the error to the console
      },
    });
  }
  function loginUser() {
    //window.location.href = "{% url 'credentials' %}";
    window.location.href = "{% url 'credentials' %}?next={{request.path}}";
  }

  {% comment %} var total_page = {{ totalPostsCount }}/10; {% endcomment %}

  function lastpage() {
    //alert(total_page);
    paginationBtn(total_page);
  }
  function prevpage() {
    if (active_page > 1) {
      paginationBtn(active_page - 1);
    }
  }
  function nextpage() {
    if (active_page < total_page) {
      paginationBtn(active_page + 1);
    }
  }

  function paginationBtn(x) {
    //console.log("btn click");
    if (x != active_page) {
      document
        .getElementById("pagination_" + active_page)
        .classList.remove("active");
      active_page = x;

      rearrangeBtns();
      
      loadPosts(active_page - 1);
    }
  }

  function rearrangeBtns(temp = false) {
    //var temp = false;
    //console.log("active_page = " + active_page);
    if (active_page <= 3 && !temp) {
      //console.log("if");
      if (starting_button != 1) {
        temp = true;
        starting_button = 1;
      }
    } else if (active_page > total_page - 3 && !temp) {
      //console.log("else if");
      if (starting_button != total_page - 4) {
        temp = true;
        starting_button = total_page - 4;
      }
    } else if (starting_button != active_page - 2 && !temp){
      //console.log("else");
      temp = true;
      starting_button = active_page - 2;
    }
    //console.log("starting_button = " + starting_button);
    if (temp) {
      var paginationBtns = document.getElementsByClassName("pagination-button");
      //console.log(paginationBtns.length);
      for (i = 0; i < paginationBtns.length; i++) {
        paginationBtns[i].id = "pagination_" + (starting_button + i);
        paginationBtns[i].setAttribute(
          "onClick",
          "paginationBtn(" + (starting_button + i) + ")"
        ); //"paginationBtn("+(starting_button+i)+");";
        paginationBtns[i].innerHTML =
          '<span class="page-link">' + (starting_button + i) + "</span>";
      }
      //console.log("for loop break");
    }

    document.getElementById("pagination_" + active_page).classList.add("active");
  }

</script>