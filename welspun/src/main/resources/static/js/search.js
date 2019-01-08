$(document).ready(function($) {
	
	var rows_selected = [];
	
	var table = $('#alpPgmList').DataTable({
		 data:[],
		 "lengthMenu": [ 5, 10, 50, 100 ],
		 columns: [
			 { 
				 "mRender": function (data, type, row) {
					 return '<input type="checkbox" class="custom_checkbox big-checkbox">';
				 }				 
			 },
			 { "mData": "id",
			 "visible":false
			 },
            {
                "mData": "project",
                "mRender": function (data, type, row) {
                    return '<a href="#" data-toggle="modal" data-id=' +row['id']+ ' data-target="#myModal" class="modal-toggle pgm-dtl-btn homeHref" data-title="View">' + data + '</a>';
                }
            },
            { "data": "pqrNum" },
            { "data": "baseMetal" },
            { "data": "thickness" },
            { "data": "temp_impactTemp" },
            { "data": "weldReqImpactMin" },
            { "data": "hazReqImpactMin" }
            
            ],
		 rowCallback: function (row, data) {},
		    processing: true,
		    retrieve: true
	 });
	
	 $(document).on('click', '.searchBttn', function(){
		 
		var baseMetal = $("#baseMetal").val();
		var thickness = $("#thickness").val();
		var impactTemp = $("#temp_impactTemp").val();
		var impactweld = $("#weldActualImpact").val();
		var impactHaz = $("#hazReqImpactMin").val();
			
		 $.get( "./search/parameters?baseMetal=" + baseMetal +"&thickness=" + thickness + 
				 "&impactTemp=" +impactTemp+ "&impactweld="+impactweld+
				 "&impactHaz=" +impactHaz, function( data ) 
				 {
			 var r = data;
			 table.clear().draw();
			 table.rows.add(data).draw();
		 });
	 });
	 
	 $(document).on('click', '.pgm-dtl-btn', function(){		 
		 $.get( "./alpdetails?id=" + $(this).data('id'), function( data ) {
			 var r = data;
			 $("#modal-body-popup").html(data);
		 });
	    });
	 
	 $(document).on('click', '.panel-dtl-title', function(e){
		    var $this = $(this);
			if(!$this.hasClass('panel-collapsed')) {
				$this.parents('.panel').find('.panel-body').slideUp();
				$this.addClass('panel-collapsed');
				$this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
			} else {
				$this.parents('.panel').find('.panel-body').slideDown();
				$this.removeClass('panel-collapsed');
				$this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
			}
		});
	 
/*	 
	 $('#alpPgmList tbody').on('click', 'input[type="checkbox"]', function(e){
		 var $row = $(this).closest('tr');

	      // Get row data
	      var data = table.row($row).data();

	      // Get row ID
	      var rowId = data['id'];
	      var index = $.inArray(rowId, rows_selected);
	      
	   // If checkbox is checked and row ID is not in list of selected row IDs
	      if(this.checked && index === -1){
	         rows_selected.push(rowId);

	      // Otherwise, if checkbox is not checked and row ID is in list of selected row IDs
	      } else if (!this.checked && index !== -1){
	         rows_selected.splice(index, 1);
	      }
	 });*/
	 
	 $(document).on('click', '.compare-btn', function(){
		 var rowcollection = table.$(".custom_checkbox:checked", { "page": "all" });
		 rowcollection.each(function (index, elem) {
		 var checkbox_value = elem.name;
		 var $row = elem.closest('tr');
		 var data = table.row($row).data();
		 // Get row ID
	      var rowId = data['id'];
	      rows_selected.push(rowId);
		 });
		 
		 if(rows_selected && rows_selected.length != 0) {
			 $.get({
				    url : "./compare",
				    traditional: true,
				    data: {'idList': rows_selected },
				    success : function(response) {
				    	$("#comp-modal-body-popup").html(response);
						 rows_selected = [];
				    },
				    error : function(e) {
				       alert('Error while getting the comparison data',e);
						 rows_selected = [];
				    }
				}); 
		 }
		 
	 });
	 
	 
	 $(document).on('click', '.collapseOne', function(){
		 var $this = $(this);
		 if ($('#tack_1, #tack_2, #tack_3, #tack_4, #tack_5, #tack_6, #tack_7, #tack_8').hasClass("collapse")) {
			 $('#tack_1, #tack_2, #tack_3, #tack_4, #tack_5, #tack_6, #tack_7, #tack_8').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#tack_1, #tack_2, #tack_3, #tack_4, #tack_5, #tack_6, #tack_7, #tack_8').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapseTwo', function(){
		 var $this = $(this);
		 if ($('#idBevel_1, #idBevel_2, #idBevel_3, #idBevel_4, #idBevel_5').hasClass("collapse")) {
			 $('#idBevel_1, #idBevel_2, #idBevel_3, #idBevel_4, #idBevel_5').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idBevel_1, #idBevel_2, #idBevel_3, #idBevel_4, #idBevel_5').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapseThree', function(){
		 var $this = $(this);
		 if ($('#idCons_1, #idCons_2, #idCons_3').hasClass("collapse")) {
			 $('#idCons_1, #idCons_2, #idCons_3').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idCons_1, #idCons_2, #idCons_3').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapseFour', function(){
		 var $this = $(this);
		 if ($('#idFlux_1').hasClass("collapse")) {
			 $('#idFlux_1').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idFlux_1').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapseFive', function(){
		 var $this = $(this);
		 if ($('#idStWir_1, #idStWir_2, #idStWir_3, #idStWir_4, #idStWir_5, #idStWir_6, #idStWir_7, #idStWir_8').hasClass("collapse")) {
			 $('#idStWir_1, #idStWir_2, #idStWir_3, #idStWir_4, #idStWir_5, #idStWir_6, #idStWir_7, #idStWir_8').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idStWir_1, #idStWir_2, #idStWir_3, #idStWir_4, #idStWir_5, #idStWir_6, #idStWir_7, #idStWir_8').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapseSix', function(){
		 var $this = $(this);
		 if ($('#idWirDia_1, #idWirDia_2, #idWirDia_3').hasClass("collapse")) {
			 $('#idWirDia_1, #idWirDia_2, #idWirDia_3').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idWirDia_1, #idWirDia_2, #idWirDia_3').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse7', function(){
		 var $this = $(this);
		 if ($('#idCur_1, #idCur_2, #idCur_3').hasClass("collapse")) {
			 $('#idCur_1, #idCur_2, #idCur_3').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idCur_1, #idCur_2, #idCur_3').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse8', function(){
		 var $this = $(this);
		 if ($('#idVol_1, #idVol_2, #idVol_3').hasClass("collapse")) {
			 $('#idVol_1, #idVol_2, #idVol_3').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idVol_1, #idVol_2, #idVol_3').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse9', function(){
		 var $this = $(this);
		 if ($('#idSH_1, #idSH_2').hasClass("collapse")) {
			 $('#idSH_1, #idSH_2').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#idSH_1, #idSH_2').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });	 

	 $(document).on('click', '.collapse10', function(){
		 var $this = $(this);
		 if ($('#odWire_1, #odWire_2, #odWire_3, #odWire_4').hasClass("collapse")) {
			 $('#odWire_1, #odWire_2, #odWire_3, #odWire_4').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#odWire_1, #odWire_2, #odWire_3, #odWire_4').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse11', function(){
		 var $this = $(this);
		 if ($('#odFlux_1').hasClass("collapse")) {
			 $('#odFlux_1').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#odFlux_1').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse12', function(){
		 var $this = $(this);
		 if ($('#odStWir_1, #odStWir_2, #odStWir_3, #odStWir_4, #odStWir_5, #odStWir_6, #odStWir_7, #odStWir_8, #odStWir_9, #odStWir_10, #odStWir_11').hasClass("collapse")) {
			 $('#odStWir_1, #odStWir_2, #odStWir_3, #odStWir_4, #odStWir_5, #odStWir_6, #odStWir_7, #odStWir_8, #odStWir_9, #odStWir_10, #odStWir_11').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#odStWir_1, #odStWir_2, #odStWir_3, #odStWir_4, #odStWir_5, #odStWir_6, #odStWir_7, #odStWir_8, #odStWir_9, #odStWir_10, #odStWir_11').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse13', function(){
		 var $this = $(this);
		 if ($('#odWireDia_1, #odWireDia_2, #odWireDia_3, #odWireDia_4').hasClass("collapse")) {
			 $('#odWireDia_1, #odWireDia_2, #odWireDia_3, #odWireDia_4').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#odWireDia_1, #odWireDia_2, #odWireDia_3, #odWireDia_4').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse14', function(){
		 var $this = $(this);
		 if ($('#odCur_1, #odCur_2, #odCur_3, #odCur_4').hasClass("collapse")) {
			 $('#odCur_1, #odCur_2, #odCur_3, #odCur_4').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#odCur_1, #odCur_2, #odCur_3, #odCur_4').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse15', function(){
		 var $this = $(this);
		 if ($('#odVol_1, #odVol_2, #odVol_3, #odVol_4').hasClass("collapse")) {
			 $('#odVol_1, #odVol_2, #odVol_3, #odVol_4').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#odVol_1, #odVol_2, #odVol_3, #odVol_4').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse16', function(){
		 var $this = $(this);
		 if ($('#odSH_1, #odSH_2').hasClass("collapse")) {
			 $('#odSH_1, #odSH_2').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#odSH_1, #odSH_2').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse17', function(){
		 var $this = $(this);
		 if ($('#temp_1').hasClass("collapse")) {
			 $('#temp_1').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#temp_1').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse18', function(){
		 var $this = $(this);
		 if ($('#req_temp_1, #req_temp_2, #req_temp_3, #req_temp_4, #req_temp_5, #req_temp_6').hasClass("collapse")) {
			 $('#req_temp_1, #req_temp_2, #req_temp_3, #req_temp_4, #req_temp_5, #req_temp_6').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#req_temp_1, #req_temp_2, #req_temp_3, #req_temp_4, #req_temp_5, #req_temp_6').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse19', function(){
		 var $this = $(this);
		 if ($('#act_temp_1, #act_temp_2, #act_temp_3').hasClass("collapse")) {
			 $('#act_temp_1, #act_temp_2, #act_temp_3').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#act_temp_1, #act_temp_2, #act_temp_3').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 $(document).on('click', '.collapse20', function(){
		 var $this = $(this);
		 if ($('#hardness_1, #hardness_2, #hardness_3').hasClass("collapse")) {
			 $('#hardness_1, #hardness_2, #hardness_3').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#hardness_1, #hardness_2, #hardness_3').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 
	 $(document).on('click', '.collapse21', function(){
		 var $this = $(this);
		 if ($('#act_hardness_1, #act_hardness_2, #act_hardness_3, #act_hardness_4, #act_hardness_5, #act_hardness_6').hasClass("collapse")) {
			 $('#act_hardness_1, #act_hardness_2, #act_hardness_3, #act_hardness_4, #act_hardness_5, #act_hardness_6').removeClass('collapse').addClass('show');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-right').addClass('fa fa-fw fa-chevron-down');
		 }
		 else {
			 $('#act_hardness_1, #act_hardness_2, #act_hardness_3, #act_hardness_4, #act_hardness_5, #act_hardness_6').removeClass('show').addClass('collapse');
			 $this.find('i').removeClass('fa fa-fw fa-chevron-down').addClass('fa fa-fw fa-chevron-right');
		 }
	 });
	 
	 
	 
});