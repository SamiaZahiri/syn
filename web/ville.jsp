<%-- 
    Document   : index
    Created on : Dec 20, 2018, 2:42:07 PM
    Author     : mst
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Purple Admin</title>
        <!-- plugins:css -->
        <link rel="stylesheet" href="Template/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="Template/vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <script src="scripts/jquery-3.3.1.min.js" type="text/javascript"></script>
        <!-- inject:css -->
        <link rel="stylesheet" href="Template/css/style.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="Template/images/favicon.png" />
    </head>
    <body>
        <div class="container-scroller">
            <!-- partial:partials/_navbar.html -->
            <%@include file="header.jsp"%>
            <!-- partial -->
            <div class="container-fluid page-body-wrapper">
                <!-- partial:partials/_sidebar.html -->
                <%@include file="menu.jsp" %>
                <!-- partial -->
                <div class="main-panel">
                    <div class="content-wrapper">
                        <div class="col-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Gestion des villes</h4>
                                    <p class="card-description">
                                        Nouvelle Ville
                                    </p>
                                    <div class="forms-sample">
                                        <div class="form-group">
                                            <label for="nom">Nom : </label>
                                            <input type="text" class="form-control" id="nom" placeholder="Name">
                                        </div>
                                        
                                        <button id="save" class="btn btn-gradient-primary mr-2">Enregistrer</button>
                                        <button class="btn btn-light">Cancel</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Tables  -->
                        
                        <div class="col-lg-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Liste des villes</h4>
                                    <p class="card-description">
                                        Add class <code>.table-striped</code>
                                    </p>
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th>
                                                    Id
                                                </th>
                                                <th>
                                                    Nom
                                                </th>
                                                <th>
                                                    Supprimer
                                                </th>
                                                <th>
                                                    Modifier
                                                </th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody id="container"> 
                                            
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!-- Tables ends -->
                    </div>
                    <!-- content-wrapper ends -->
                    <!-- partial:partials/_footer.html -->
                    <footer class="footer">
                        <div class="d-sm-flex justify-content-center justify-content-sm-between">
                            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2017 <a href="https://www.bootstrapdash.com/" target="_blank">Bootstrap Dash</a>. All rights reserved.</span>
                            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i class="mdi mdi-heart text-danger"></i></span>
                        </div>
                    </footer>
                    <!-- partial -->
                </div>
                <!-- main-panel ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->

        <!-- plugins:js -->
        <script src="Template/vendors/js/vendor.bundle.base.js"></script>
        <script src="Template/vendors/js/vendor.bundle.addons.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page-->
        <!-- End plugin js for this page-->
        <!-- inject:js -->
        <script src="Template/js/off-canvas.js"></script>
        <script src="Template/js/misc.js"></script>
        <!-- endinject -->
        <!-- Custom js for this page-->
        <script src="Template/js/dashboard.js"></script>
        <!-- End custom js for this page-->
        <script src="scripts/ville.js" type="text/javascript"></script>

    </body>

</html>
