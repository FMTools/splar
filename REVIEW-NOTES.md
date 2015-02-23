# NOTES

The following are some notes taken after reviewing the code. This notes are used as a foundation to re-organize the project. This file will be removed in later versions. 

### splar.apps 

* **NOTE:** this package have been moved to src/test
* DevelopmentTests is a test
* SPLOTCatalogConfigurationBackEnd includes a constant for an FM folder

### splar.apps.experiments

* **NOTE:** this package have been moved to src/test
* Extractor includes a constant for an FM folder (is a test?)
* GenBench is a generator of feature models
* GenFM is a (random-based) generator of feature models
* JSONFeatureModel reads a feature model from a JSON string
* ScalabilityExperiments includes a constant for an FM folder
* Tests performs some tests with JSON messages
* TestValidDomains compare SAT optimizations. It includes a constant for an FM folder

### splar.apps.generator

* includes GUI and classes for generating test Feature models
* FMGeneratorengine, FMGeneratorEngineListener supports FM generation
* FMGeneratorGUI, FMGeneratorGUIEvent, FMGeneratorGUIListener and FMGeneratorMain supports GUI 

### splar.core.constraints.parsing

* CNFClauseParser has a note stating that is incomplete
* PFParser and PFParseTree are empty classes

### splar.core.fm

* XMLFeatureModel is a model persisted in XML (extend FeatureModel)
* FeatureModel implements TreeListener (from Swing)
* FeatureTreeNode implements DefaultMutableTreeNode (from Swing)
* RootNode, SolitaireFeature, GroupedFeature, FeatureGroup extends FeatureTreeNode
* FeatureModelState maintains the state of a model during configuration (?)
* FeatureModelStatistics obtains statistics from a FM

* FeatureTree (JTree), FeatureTreeCellRenderer, IFNodeRenderer, TreeNodeRendererFactory are classes for AWT/Swing GUI
 
### splar.core.fm.clustering

* Classes to cluster constraints/features

### splar.core.fm.configuration

* Classes of the Engine for Configuring feature models

### splar.core.fm.randomization
 
* Classes for random feature models

### splar.core.reasoning

* FMReasoningInterface defines operations on feature models
* FMReasoningException defines an Exception class for these operations

### splar.core.heuristics

* multiple Heuristics to process feature models

### splar.core.util

* CombinationGenerator mentions a broken URL. It generates permutations/combinations
* Utils generates some utility files and graphics

### splar.core.util.alloy

* FM2AlloyConversor includes string constants. It converts an FM to Alloy 

### splar.core.util.hypergraphs

* Hypergraph classes used for heuristics

### splar.plugins.configuration.bdd.javabdd

* Engine to configure FMs using JavaBDD

### splar.plugins.configuration.bdd.javabdd.catalog

* Product catalog (used by the BDDConfigurationEngine). It is used to add constraints to FMs so that only products in the catalog are valid

### splar.plugins.configuration.sat.sat4j

* Engine to configure FMs using SAT

### splar.plugins.configuration.(tests, tests.bdd.javabdd and tests.sat.sat4j)

* **NOTE:** These packages have been moved to src/test
* Tests

### splar.plugins.reasoners.(bdd.javabdd and sat.sat4j) 

* Classes to reason about FMs

