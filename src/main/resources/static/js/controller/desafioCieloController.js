desafioCieloApp.controller('desafioCieloController', ['$scope', '$modal', 'desafioCieloFactory',
	function($scope, $modal, desafioCieloFactory) {
	
		$scope.showDialogError = false;
		$scope.mensagem = "";
		$scope.dto = [];
	
		$scope.buscaLancamentosConta = function() {
			openGifModal();
			desafioCieloFactory.buscaLancamentosConta().then(
	                function(response) {
	                	$scope.dto = response.data;
	                	closeGifModal();
	                	if($scope.dto.erro) {
	                		$scope.mensagem = $scope.dto.mensagem;
		                    $scope.showDialogError = true;
	                	}
	                },
	                function(error) {
	                    console.log(error);
	                    closeGifModal();
	                    $scope.mensagem = "Ocorreu um erro ao buscar os lançamentos da conta, por favor contacte o administrador do sistema.";
	                    $scope.showDialogError = true;
	                })
		};
		
		$scope.buscaLancamentosConta();
		
		$scope.closeDialogError = function() {
        	$scope.showDialogError = false;
        };
		
		function openGifModal() {
            $scope.ModalGif = $modal.open({
                templateUrl: 'lib/ui-bootstrap/modal-gif.html',
                controller: function($modalInstance) {}
            });
        }

        function closeGifModal() {
            if ($scope.ModalGif !== undefined)
                $scope.ModalGif.close();
        }
	} 
]);